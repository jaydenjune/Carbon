package tk.zielony.carbonsamples.component;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;

import java.util.Arrays;

import carbon.Carbon;
import carbon.component.DefaultIconSearchItem;
import carbon.component.DefaultIconTextItem;
import carbon.component.IconSearchRow;
import carbon.component.IconTextRow;
import carbon.drawable.VectorDrawable;
import carbon.recycler.DividerItemDecoration;
import carbon.recycler.RowListAdapter;
import carbon.widget.ArraySearchDataProvider;
import carbon.widget.RecyclerView;
import tk.zielony.carbonsamples.R;
import tk.zielony.carbonsamples.Samples;
import tk.zielony.carbonsamples.SamplesActivity;

public class IconTextListItemActivity extends SamplesActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listcomponent);

        Samples.initToolbar(this, getString(R.string.iconTextListItemActivity_title));

        RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        RowListAdapter adapter = new RowListAdapter<>(DefaultIconTextItem.class, IconTextRow::new);
        adapter.addFactory(DefaultIconSearchItem.class, parent -> new IconSearchRow(parent, new ArraySearchDataProvider(new String[]{}), filterResults -> {

        }));
        recycler.setAdapter(adapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(new ColorDrawable(Carbon.getThemeColor(this, R.attr.carbon_dividerColor)), getResources().getDimensionPixelSize(R.dimen.carbon_1dip));
        dividerItemDecoration.setDrawRules(position -> position == 0);
        recycler.addItemDecoration(dividerItemDecoration);
        VectorDrawable drawable = new VectorDrawable(getResources(), R.raw.ic_face_24px);
        adapter.setItems(Arrays.asList(
                new DefaultIconSearchItem(this),
                new DefaultIconTextItem(drawable, "text"),
                new DefaultIconTextItem(drawable, "text"),
                new DefaultIconTextItem(drawable, "text"),
                new DefaultIconTextItem(drawable, "text")));
    }
}
