package nm;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class h implements i {
    private static final /* synthetic */ h[] $VALUES;
    public static final h IDENTITY;
    public static final h LOWER_CASE_WITH_DASHES;
    public static final h LOWER_CASE_WITH_DOTS;
    public static final h LOWER_CASE_WITH_UNDERSCORES;
    public static final h UPPER_CAMEL_CASE;
    public static final h UPPER_CAMEL_CASE_WITH_SPACES;
    public static final h UPPER_CASE_WITH_UNDERSCORES;

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        final String str = "UPPER_CAMEL_CASE";
        final int i13 = 1;
        h hVar = new h(str, i13) { // from class: nm.b
            {
                a aVar2 = null;
            }

            @Override // nm.h, nm.i
            public String translateName(Field field) {
                return h.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = hVar;
        final String str2 = "UPPER_CAMEL_CASE_WITH_SPACES";
        final int i14 = 2;
        h hVar2 = new h(str2, i14) { // from class: nm.c
            {
                a aVar2 = null;
            }

            @Override // nm.h, nm.i
            public String translateName(Field field) {
                return h.upperCaseFirstLetter(h.separateCamelCase(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = hVar2;
        final String str3 = "UPPER_CASE_WITH_UNDERSCORES";
        final int i15 = 3;
        h hVar3 = new h(str3, i15) { // from class: nm.d
            {
                a aVar2 = null;
            }

            @Override // nm.h, nm.i
            public String translateName(Field field) {
                return h.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = hVar3;
        final String str4 = "LOWER_CASE_WITH_UNDERSCORES";
        final int i16 = 4;
        h hVar4 = new h(str4, i16) { // from class: nm.e
            {
                a aVar2 = null;
            }

            @Override // nm.h, nm.i
            public String translateName(Field field) {
                return h.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = hVar4;
        final String str5 = "LOWER_CASE_WITH_DASHES";
        final int i17 = 5;
        h hVar5 = new h(str5, i17) { // from class: nm.f
            {
                a aVar2 = null;
            }

            @Override // nm.h, nm.i
            public String translateName(Field field) {
                return h.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = hVar5;
        final String str6 = "LOWER_CASE_WITH_DOTS";
        final int i18 = 6;
        h hVar6 = new h(str6, i18) { // from class: nm.g
            {
                a aVar2 = null;
            }

            @Override // nm.h, nm.i
            public String translateName(Field field) {
                return h.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = hVar6;
        $VALUES = new h[]{aVar, hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
    }

    private h(String str, int i13) {
    }

    public static String separateCamelCase(String str, char c13) {
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char charAt = str.charAt(i13);
            if (Character.isUpperCase(charAt) && sb3.length() != 0) {
                sb3.append(c13);
            }
            sb3.append(charAt);
        }
        return sb3.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char charAt = str.charAt(i13);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i13 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i13) + upperCase + str.substring(i13 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public abstract /* synthetic */ String translateName(Field field);

    public /* synthetic */ h(String str, int i13, a aVar) {
        this(str, i13);
    }
}
