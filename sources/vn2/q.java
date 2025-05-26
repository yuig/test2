package vn2;

import ao2.m0;

/* loaded from: classes2.dex */
public abstract class q implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126340a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126341b;

    public /* synthetic */ q(String str, int i13) {
        this.f126340a = i13;
        this.f126341b = str;
    }

    @Override // vn2.e
    public final String b(am2.x xVar) {
        switch (this.f126340a) {
        }
        return m0.Q(this, xVar);
    }

    @Override // vn2.e
    public final String getDescription() {
        return this.f126341b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(String str, int i13, int i14) {
        this(str, 0);
        this.f126340a = i13;
        int i15 = 1;
        if (i13 != 1) {
        } else {
            this(str, i15);
        }
    }
}
