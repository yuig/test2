package ju;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;

    @NotNull
    private static final e[] VALUES;
    private final int value;
    public static final e CUSTOM = new e("CUSTOM", 0, 1);
    public static final e FULL_NAME = new e("FULL_NAME", 1, 2);
    public static final e FIRST_NAME = new e("FIRST_NAME", 2, 3);
    public static final e LAST_NAME = new e("LAST_NAME", 3, 4);
    public static final e EMAIL = new e("EMAIL", 4, 5);
    public static final e PHONE_NUMBER = new e("PHONE_NUMBER", 5, 6);
    public static final e ZIP_CODE = new e("ZIP_CODE", 6, 7);
    public static final e AGE = new e("AGE", 7, 8);
    public static final e GENDER = new e("GENDER", 8, 9);
    public static final e CITY = new e("CITY", 9, 10);
    public static final e COUNTRY = new e("COUNTRY", 10, 11);
    public static final e PREFERRED_CONTACT_METHOD = new e("PREFERRED_CONTACT_METHOD", 11, 12);
    public static final e STATE_PROVINCE = new e("STATE_PROVINCE", 12, 13);
    public static final e ADDRESS = new e("ADDRESS", 13, 14);
    public static final e DATE_OF_BIRTH = new e("DATE_OF_BIRTH", 14, 15);
    public static final e DATE_OF_BIRTH_DAY = new e("DATE_OF_BIRTH_DAY", 15, 16);
    public static final e DATE_OF_BIRTH_MONTH = new e("DATE_OF_BIRTH_MONTH", 16, 17);

    private static final /* synthetic */ e[] $values() {
        return new e[]{CUSTOM, FULL_NAME, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, ZIP_CODE, AGE, GENDER, CITY, COUNTRY, PREFERRED_CONTACT_METHOD, STATE_PROVINCE, ADDRESS, DATE_OF_BIRTH, DATE_OF_BIRTH_DAY, DATE_OF_BIRTH_MONTH};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
        VALUES = values();
    }

    private e(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
