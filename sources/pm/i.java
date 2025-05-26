package pm;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f100597a;

    static {
        int i13;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]", 3);
            i13 = Integer.parseInt(split[0]);
            if (i13 == 1 && split.length > 1) {
                i13 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i13 = -1;
        }
        if (i13 == -1) {
            try {
                StringBuilder sb3 = new StringBuilder();
                for (int i14 = 0; i14 < property.length(); i14++) {
                    char charAt = property.charAt(i14);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb3.append(charAt);
                }
                i13 = Integer.parseInt(sb3.toString());
            } catch (NumberFormatException unused2) {
                i13 = -1;
            }
        }
        if (i13 == -1) {
            i13 = 6;
        }
        f100597a = i13;
    }

    public static boolean a() {
        return f100597a >= 9;
    }
}
