package p9;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f99130a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99131b;

    /* renamed from: c, reason: collision with root package name */
    public final int f99132c;

    /* renamed from: d, reason: collision with root package name */
    public final int f99133d;

    /* renamed from: e, reason: collision with root package name */
    public final int f99134e;

    public a(int i13, int i14, int i15, int i16, int i17) {
        this.f99130a = i13;
        this.f99131b = i14;
        this.f99132c = i15;
        this.f99133d = i16;
        this.f99134e = i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a a(String str) {
        char c13;
        bf.b.i(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < split.length; i17++) {
            String q13 = com.bumptech.glide.c.q1(split[i17].trim());
            q13.getClass();
            switch (q13.hashCode()) {
                case 100571:
                    if (q13.equals("end")) {
                        c13 = 0;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 3556653:
                    if (q13.equals("text")) {
                        c13 = 1;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 109757538:
                    if (q13.equals("start")) {
                        c13 = 2;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 109780401:
                    if (q13.equals("style")) {
                        c13 = 3;
                        break;
                    }
                    c13 = 65535;
                    break;
                default:
                    c13 = 65535;
                    break;
            }
            switch (c13) {
                case 0:
                    i14 = i17;
                    break;
                case 1:
                    i16 = i17;
                    break;
                case 2:
                    i13 = i17;
                    break;
                case 3:
                    i15 = i17;
                    break;
            }
        }
        if (i13 == -1 || i14 == -1 || i16 == -1) {
            return null;
        }
        return new a(i13, i14, i15, i16, split.length);
    }
}
