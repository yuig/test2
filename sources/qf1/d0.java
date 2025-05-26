package qf1;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103654i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f103655j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Resources f103656k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(i0 i0Var, Resources resources, int i13) {
        super(1);
        this.f103654i = i13;
        this.f103655j = i0Var;
        this.f103656k = resources;
    }

    public final void b(Throwable th3) {
        int i13 = this.f103654i;
        Resources resources = this.f103656k;
        i0 i0Var = this.f103655j;
        switch (i13) {
            case 0:
                i0.a(i0Var, resources);
                break;
            case 1:
                i0.a(i0Var, resources);
                break;
            case 2:
                i0.a(i0Var, resources);
                break;
            case 3:
                i0.a(i0Var, resources);
                break;
            case 4:
                i0.a(i0Var, resources);
                break;
            case 5:
                i0.a(i0Var, resources);
                break;
            default:
                i0.a(i0Var, resources);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f103654i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                b((Throwable) obj);
                break;
            case 5:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
