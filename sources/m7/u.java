package m7;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements ok.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86401a;

    public /* synthetic */ u(int i13) {
        this.f86401a = i13;
    }

    @Override // ok.t
    public final Object apply(Object obj) {
        switch (this.f86401a) {
            case 0:
                return new n7.c0((d7.e) obj);
            default:
                Pattern pattern = p7.d.B;
                return pk.c1.v(Integer.valueOf(((h8.l) obj).f68037a));
        }
    }
}
