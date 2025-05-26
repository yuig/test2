package nq2;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f91832a = 0;

    static {
        try {
            try {
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            String.format("%n", new Object[0]);
        }
    }

    public static String a(String str) {
        char[] charArray = str.toCharArray();
        boolean z13 = false;
        for (int i13 = 0; i13 != charArray.length; i13++) {
            char c13 = charArray[i13];
            if ('A' <= c13 && 'Z' >= c13) {
                charArray[i13] = (char) (c13 + ' ');
                z13 = true;
            }
        }
        return z13 ? new String(charArray) : str;
    }
}
