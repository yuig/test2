package ads_mobile_sdk;

import android.view.View;
import android.widget.ImageView;
import ao2.j0;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class we0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kf0 f13010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f13011c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f13012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ImageView.ScaleType f13013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we0(kf0 kf0Var, View view, Map map, ImageView.ScaleType scaleType, bl2.c cVar) {
        super(2, cVar);
        this.f13010b = kf0Var;
        this.f13011c = view;
        this.f13012d = map;
        this.f13013e = scaleType;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new we0(this.f13010b, this.f13011c, this.f13012d, this.f13013e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((we0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f13009a;
        if (i13 == 0) {
            ue.c.H(obj);
            a.pf pfVar = (a.pf) this.f13010b.f13640b.get();
            if (pfVar != null) {
                kf0 kf0Var = this.f13010b;
                this.f13009a = 1;
                if (kf0.a(kf0Var, pfVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        kf0 kf0Var2 = this.f13010b;
        qh1 j13 = kh2.a1.j(kf0Var2.f7269m, kf0Var2.f7270n, kf0Var2.f7267k, this.f13011c, this.f13012d, this.f13013e);
        kf0 kf0Var3 = this.f13010b;
        View view = this.f13011c;
        sb2 sb2Var = kf0Var3.f7269m;
        il0 il0Var = il0.CUI_NAME_VIEW_SIGNALS;
        ss2 ss2Var = kf0Var3.f7270n;
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        if (qs2.b().f9801a == null) {
            p12 a13 = sb2.a(sb2Var, il0Var, q0Var, ss2Var);
            try {
                String a14 = kf0Var3.f7265i.a(view);
                if (a14 instanceof jk0) {
                    ft2.a((jk0) a14);
                }
                dl2.b.J(a13, null);
                str = a14;
            } catch (Throwable th3) {
                try {
                    a13.b(th3);
                    if (th3 instanceof a.jf) {
                        throw th3;
                    }
                    a13.a(th3);
                    if (th3 instanceof TimeoutCancellationException) {
                        throw new xl0(th3);
                    }
                    if (th3 instanceof CancellationException) {
                        throw new yj0(th3);
                    }
                    if (th3 instanceof uk0) {
                        throw th3;
                    }
                    throw new dk0(th3);
                } finally {
                }
            }
        } else {
            cs2 a15 = qs2.a(il0Var, q0Var, true);
            try {
                String a16 = kf0Var3.f7265i.a(view);
                if (a16 instanceof jk0) {
                    ft2.a((jk0) a16);
                }
                dl2.b.J(a15, null);
                str = a16;
            } catch (Throwable th4) {
                try {
                    a15.b(th4);
                    if (th4 instanceof a.jf) {
                        throw th4;
                    }
                    a15.a(th4);
                    if (th4 instanceof TimeoutCancellationException) {
                        throw new xl0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new yj0(th4);
                    }
                    if (th4 instanceof uk0) {
                        throw th4;
                    }
                    throw new dk0(th4);
                } finally {
                }
            }
        }
        kf0 kf0Var4 = this.f13010b;
        kf0Var4.a(j13, str, !kf0Var4.f7279w.f10380m0 ? false : true ^ kf0Var4.f7280x);
        return Unit.f80348a;
    }
}
