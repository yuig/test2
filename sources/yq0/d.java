package yq0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139686a;

    public d(int i13) {
        this.f139686a = i13;
    }

    @Override // yq0.a
    public final Function0 getCreator() {
        switch (this.f139686a) {
            case 0:
                return new zp0.a(this, 15);
            case 1:
                return new zp0.a(this, 16);
            case 2:
                return new zp0.a(this, 17);
            case 3:
                return new zp0.a(this, 18);
            default:
                return new zp0.a(this, 19);
        }
    }
}
