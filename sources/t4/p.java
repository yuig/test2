package t4;

import java.text.DecimalFormat;
import kh2.c3;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public c3 f116400a;

    /* renamed from: b, reason: collision with root package name */
    public String f116401b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f116402c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f116403d;

    /* renamed from: e, reason: collision with root package name */
    public long f116404e;

    /* renamed from: f, reason: collision with root package name */
    public float f116405f;

    public void a(int i13) {
        System.err.println("Error no points added to " + this.f116401b);
    }

    public final String toString() {
        String str = this.f116401b;
        new DecimalFormat("##.##");
        return str;
    }
}
