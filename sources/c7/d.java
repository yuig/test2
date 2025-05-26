package c7;

import android.os.Bundle;
import android.text.Spanned;
import d7.n0;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f26703a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f26704b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f26705c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f26706d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f26707e;

    static {
        int i13 = n0.f53866a;
        f26703a = Integer.toString(0, 36);
        f26704b = Integer.toString(1, 36);
        f26705c = Integer.toString(2, 36);
        f26706d = Integer.toString(3, 36);
        f26707e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i13, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f26703a, spanned.getSpanStart(obj));
        bundle2.putInt(f26704b, spanned.getSpanEnd(obj));
        bundle2.putInt(f26705c, spanned.getSpanFlags(obj));
        bundle2.putInt(f26706d, i13);
        if (bundle != null) {
            bundle2.putBundle(f26707e, bundle);
        }
        return bundle2;
    }
}
