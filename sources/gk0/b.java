package gk0;

import ao2.j0;
import ao2.v0;
import bl2.c;
import com.pinterest.api.model.v7;
import com.pinterest.error.NoConnectionErrorWithUrls;
import dl2.j;
import do1.n;
import fk0.u;
import gx.e;
import java.util.ArrayList;
import ko2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import s7.z;
import u50.k0;
import u50.r;
import xk2.q;
import xk2.s;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f65207r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f65208s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f65209t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f65210u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f65211v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u uVar, e eVar, r rVar, c cVar) {
        super(2, cVar);
        this.f65209t = uVar;
        this.f65210u = eVar;
        this.f65211v = rVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        b bVar = new b(this.f65209t, this.f65210u, this.f65211v, cVar);
        bVar.f65208s = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f65207r;
        e eVar = this.f65210u;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                u uVar = this.f65209t;
                q qVar = s.f135225b;
                z zVar = new z(((fk0.s) uVar).f62323a, ((fk0.s) uVar).f62324b, (z42.c) null, 12);
                f fVar = v0.f20219a;
                ko2.e eVar2 = ko2.e.f80326c;
                a aVar2 = new a(eVar, zVar, null);
                this.f65207r = 1;
                obj = kotlin.jvm.internal.j.M(this, eVar2, aVar2);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            m13 = (v7) obj;
            q qVar2 = s.f135225b;
        } catch (Throwable th3) {
            q qVar3 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (!(m13 instanceof xk2.r)) {
            String id3 = ((v7) m13).getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            this.f65211v.a(new fk0.c(id3));
        }
        Throwable a13 = s.a(m13);
        if (a13 != null && (a13 instanceof NoConnectionErrorWithUrls)) {
            b20.c cVar = (b20.c) eVar.f66247c;
            int i14 = x0.create_new_board_fail;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            b20.c.B(cVar, new k92.b(new k92.c(new k0(i14, new ArrayList(0)), null, n.ERROR, false, 94)), null, null, 30);
        }
        return Unit.f80348a;
    }
}
