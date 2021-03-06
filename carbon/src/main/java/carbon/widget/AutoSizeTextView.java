package carbon.widget;

import android.support.annotation.NonNull;

public interface AutoSizeTextView {

    @NonNull
    AutoSizeTextMode getAutoSizeText();

    void setAutoSizeText(@NonNull AutoSizeTextMode autoSizeText);

    float getMinTextSize();

    void setMinTextSize(float minTextSize);

    float getMaxTextSize();

    void setMaxTextSize(float maxTextSize);

    float getAutoSizeStepGranularity();

    void setAutoSizeStepGranularity(float autoSizeStepGranularity);
}
