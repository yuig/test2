package ok;

import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i LOWER_CAMEL;
    public static final i LOWER_HYPHEN = new c("LOWER_HYPHEN", 0, new l('-'), "-");
    public static final i LOWER_UNDERSCORE;
    public static final i UPPER_CAMEL;
    public static final i UPPER_UNDERSCORE;
    private final p wordBoundary;
    private final String wordSeparator;

    private static /* synthetic */ i[] $values() {
        return new i[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    static {
        final l lVar = new l('_');
        final String str = "LOWER_UNDERSCORE";
        final int i13 = 1;
        final String str2 = "_";
        LOWER_UNDERSCORE = new i(str, i13, lVar, str2) { // from class: ok.d
            {
                c cVar = null;
            }

            @Override // ok.i
            public String convert(i iVar, String str3) {
                return iVar == i.LOWER_HYPHEN ? str3.replace('_', '-') : iVar == i.UPPER_UNDERSCORE ? com.bumptech.glide.c.r1(str3) : super.convert(iVar, str3);
            }

            @Override // ok.i
            public String normalizeWord(String str3) {
                return com.bumptech.glide.c.q1(str3);
            }
        };
        final j jVar = new j() { // from class: ok.k

            /* renamed from: a, reason: collision with root package name */
            public final char f95435a = 'A';

            /* renamed from: b, reason: collision with root package name */
            public final char f95436b = 'Z';

            @Override // ok.p
            public final boolean c(char c13) {
                return this.f95435a <= c13 && c13 <= this.f95436b;
            }

            public final String toString() {
                return "CharMatcher.inRange('" + p.a(this.f95435a) + "', '" + p.a(this.f95436b) + "')";
            }
        };
        final String str3 = "LOWER_CAMEL";
        final int i14 = 2;
        final String str4 = "";
        LOWER_CAMEL = new i(str3, i14, jVar, str4) { // from class: ok.e
            {
                c cVar = null;
            }

            @Override // ok.i
            public String normalizeFirstWord(String str5) {
                return com.bumptech.glide.c.q1(str5);
            }

            @Override // ok.i
            public String normalizeWord(String str5) {
                String firstCharOnlyToUpper;
                firstCharOnlyToUpper = i.firstCharOnlyToUpper(str5);
                return firstCharOnlyToUpper;
            }
        };
        final j jVar2 = new j() { // from class: ok.k

            /* renamed from: a, reason: collision with root package name */
            public final char f95435a = 'A';

            /* renamed from: b, reason: collision with root package name */
            public final char f95436b = 'Z';

            @Override // ok.p
            public final boolean c(char c13) {
                return this.f95435a <= c13 && c13 <= this.f95436b;
            }

            public final String toString() {
                return "CharMatcher.inRange('" + p.a(this.f95435a) + "', '" + p.a(this.f95436b) + "')";
            }
        };
        final String str5 = "UPPER_CAMEL";
        final int i15 = 3;
        UPPER_CAMEL = new i(str5, i15, jVar2, str4) { // from class: ok.f
            {
                c cVar = null;
            }

            @Override // ok.i
            public String normalizeWord(String str6) {
                String firstCharOnlyToUpper;
                firstCharOnlyToUpper = i.firstCharOnlyToUpper(str6);
                return firstCharOnlyToUpper;
            }
        };
        final l lVar2 = new l('_');
        final String str6 = "UPPER_UNDERSCORE";
        final int i16 = 4;
        UPPER_UNDERSCORE = new i(str6, i16, lVar2, str2) { // from class: ok.g
            {
                c cVar = null;
            }

            @Override // ok.i
            public String convert(i iVar, String str7) {
                return iVar == i.LOWER_HYPHEN ? com.bumptech.glide.c.q1(str7.replace('_', '-')) : iVar == i.LOWER_UNDERSCORE ? com.bumptech.glide.c.q1(str7) : super.convert(iVar, str7);
            }

            @Override // ok.i
            public String normalizeWord(String str7) {
                return com.bumptech.glide.c.r1(str7);
            }
        };
        $VALUES = $values();
    }

    public /* synthetic */ i(String str, int i13, p pVar, String str2, c cVar) {
        this(str, i13, pVar, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        char charAt = str.charAt(0);
        if (com.bumptech.glide.c.s0(charAt)) {
            charAt = (char) (charAt ^ ' ');
        }
        sb3.append(charAt);
        sb3.append(com.bumptech.glide.c.q1(str.substring(1)));
        return sb3.toString();
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public String convert(i iVar, String str) {
        StringBuilder sb3 = null;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            i14 = this.wordBoundary.b(i14 + 1, str);
            if (i14 == -1) {
                break;
            }
            if (i13 == 0) {
                sb3 = new StringBuilder((iVar.wordSeparator.length() * 4) + str.length());
                sb3.append(iVar.normalizeFirstWord(str.substring(i13, i14)));
            } else {
                Objects.requireNonNull(sb3);
                sb3.append(iVar.normalizeWord(str.substring(i13, i14)));
            }
            sb3.append(iVar.wordSeparator);
            i13 = this.wordSeparator.length() + i14;
        }
        if (i13 == 0) {
            return iVar.normalizeFirstWord(str);
        }
        Objects.requireNonNull(sb3);
        sb3.append(iVar.normalizeWord(str.substring(i13)));
        return sb3.toString();
    }

    public q converterTo(i iVar) {
        return new h(this, iVar);
    }

    public String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    public abstract String normalizeWord(String str);

    public final String to(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        return iVar == this ? str : convert(iVar, str);
    }

    private i(String str, int i13, p pVar, String str2) {
        this.wordBoundary = pVar;
        this.wordSeparator = str2;
    }
}
