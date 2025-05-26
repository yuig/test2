package wk0;

import ck2.i;
import java.util.HashSet;
import jk2.d0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import pj0.f;
import r41.k;
import tb0.g;
import tb0.h;
import uj2.q;
import x02.a2;
import x02.x0;
import x02.z0;
import xk0.d;
import yk1.n;

/* loaded from: classes5.dex */
public final class c extends yk1.b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f130107a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f130108b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f130109c;

    /* renamed from: d, reason: collision with root package name */
    public final jl0.b f130110d;

    /* renamed from: e, reason: collision with root package name */
    public final h f130111e;

    /* renamed from: f, reason: collision with root package name */
    public final k f130112f;

    /* renamed from: g, reason: collision with root package name */
    public vk0.b f130113g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String boardId, x0 boardRepository, z0 boardSectionRepository, jl0.b boardUtils, k profileNavigator) {
        super(0);
        HashSet hashSet = h.f117076w;
        h crashReporter = g.f117075a;
        Intrinsics.checkNotNullExpressionValue(crashReporter, "getInstance(...)");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(boardUtils, "boardUtils");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
        this.f130107a = boardId;
        this.f130108b = boardRepository;
        this.f130109c = boardSectionRepository;
        this.f130110d = boardUtils;
        this.f130111e = crashReporter;
        this.f130112f = profileNavigator;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        n view = (uk0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        x0 x0Var = this.f130108b;
        String str = this.f130107a;
        q C = x0Var.C(str);
        f fVar = new f(26, new a(this, 3));
        f fVar2 = new f(27, b.f130105k);
        ck2.c cVar = i.f27923c;
        a2 a2Var = i.f27924d;
        addDisposable(C.F(fVar, fVar2, cVar, a2Var));
        addDisposable(this.f130109c.z().F(new f(24, new a(this, 2)), new f(25, b.f130104j), cVar, a2Var));
        q Q = x0Var.Q(str);
        hk2.b bVar = new hk2.b(new f(28, new a(this, 0)), new f(29, new a(this, 1)), cVar);
        try {
            Q.d(new d0(bVar, 0L));
            addDisposable(bVar);
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            throw o.g(th3, "subscribeActual failed", th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p3(vk0.b r22) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wk0.c.p3(vk0.b):void");
    }
}
