package bo;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23598a;

    /* renamed from: b, reason: collision with root package name */
    public static final SecureRandom f23599b;

    static {
        String b13 = b('a', 'z');
        String b14 = b('A', 'Z');
        f23598a = a.a.C(a.a.C(b13, b14), b('0', '9'));
        f23599b = new SecureRandom();
    }

    public static String a(int i13) {
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < i13; i14++) {
            SecureRandom secureRandom = f23599b;
            String str = f23598a;
            sb3.append(str.charAt(secureRandom.nextInt(str.length())));
        }
        return sb3.toString();
    }

    public static String b(char c13, char c14) {
        StringBuilder sb3 = new StringBuilder();
        while (c13 <= c14) {
            sb3.append(c13);
            c13 = (char) (c13 + 1);
        }
        return sb3.toString();
    }
}
