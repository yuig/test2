package k8;

import a7.c1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f78573a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f78574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78575c;

    public r(c1 c1Var, int[] iArr) {
        if (iArr.length == 0) {
            d7.u.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f78573a = c1Var;
        this.f78574b = iArr;
        this.f78575c = 0;
    }
}
