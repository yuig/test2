package cz;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    private final boolean shouldClearSurveyData;
    private final boolean showSuccessToast;
    private final Integer successMessage;
    public static final n MODAL = new n("MODAL", 0, true, false, null);
    public static final n INLINE = new n("INLINE", 1, false, true, Integer.valueOf(nz.e.anket_inline_survey_submit_answer_success_message));

    private static final /* synthetic */ n[] $values() {
        return new n[]{MODAL, INLINE};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private n(String str, int i13, boolean z13, boolean z14, Integer num) {
        this.shouldClearSurveyData = z13;
        this.showSuccessToast = z14;
        this.successMessage = num;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final boolean getShouldClearSurveyData() {
        return this.shouldClearSurveyData;
    }

    public final boolean getShowSuccessToast() {
        return this.showSuccessToast;
    }

    public final Integer getSuccessMessage() {
        return this.successMessage;
    }
}
