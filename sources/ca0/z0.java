package ca0;

import org.jetbrains.annotations.NotNull;
import s80.l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 AltText = new z0("AltText", 2, u50.g0.b(new String[0], l7.publish_option_alt_text_input_title), u50.g0.b(new String[0], l7.publish_option_alt_text_input_placeholder_updated), u50.g0.b(new String[0], l7.publish_option_alt_text_input_description_updated), zp1.a.pin_alt_text_max_length);
    public static final z0 Description;
    public static final z0 Title;

    @NotNull
    private final u50.i0 description;
    private final int maxCharacterCount;

    @NotNull
    private final u50.i0 placeholder;

    @NotNull
    private final u50.i0 title;

    private static final /* synthetic */ z0[] $values() {
        return new z0[]{Title, Description, AltText};
    }

    static {
        String str = "Title";
        Title = new z0(str, 0, u50.g0.b(new String[0], l7.publish_option_title_input_title), u50.g0.b(new String[0], l7.publish_option_title_input_placeholder), null, zp1.a.pin_max_title_length, 4, null);
        String str2 = "Description";
        Description = new z0(str2, 1, u50.g0.b(new String[0], l7.publish_option_description_input_title), u50.g0.b(new String[0], l7.publish_option_description_input_placeholder), null, zp1.a.idea_pin_description_max_length, 4, null);
        z0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ z0(java.lang.String r10, int r11, u50.i0 r12, u50.i0 r13, u50.i0 r14, int r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 2
            u50.h0 r1 = u50.h0.f120562a
            if (r0 == 0) goto L8
            r6 = r1
            goto L9
        L8:
            r6 = r13
        L9:
            r0 = r16 & 4
            if (r0 == 0) goto Lf
            r7 = r1
            goto L10
        Lf:
            r7 = r14
        L10:
            r0 = r16 & 8
            if (r0 == 0) goto L17
            r0 = 0
            r8 = r0
            goto L18
        L17:
            r8 = r15
        L18:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.z0.<init>(java.lang.String, int, u50.i0, u50.i0, u50.i0, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }

    @NotNull
    public final u50.i0 getDescription() {
        return this.description;
    }

    public final int getMaxCharacterCount() {
        return this.maxCharacterCount;
    }

    @NotNull
    public final u50.i0 getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final u50.i0 getTitle() {
        return this.title;
    }

    private z0(String str, int i13, u50.i0 i0Var, u50.i0 i0Var2, u50.i0 i0Var3, int i14) {
        this.title = i0Var;
        this.placeholder = i0Var2;
        this.description = i0Var3;
        this.maxCharacterCount = i14;
    }
}
