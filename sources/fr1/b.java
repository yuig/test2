package fr1;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import dl2.j;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import qr1.n;
import zn2.f;
import zn2.g;
import zn2.h;
import zn2.i;

/* loaded from: classes2.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public long f62819r;

    /* renamed from: s, reason: collision with root package name */
    public int f62820s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f62821t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f62821t = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f62821t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        long j13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62820s;
        c cVar = this.f62821t;
        if (i13 == 0) {
            ue.c.H(obj);
            h.f142318a.getClass();
            f.f142316a.getClass();
            long a13 = f.a();
            cr1.f fVar = cVar.f62823b;
            this.f62819r = a13;
            this.f62820s = 1;
            obj = fVar.a(this);
            if (obj == aVar) {
                return aVar;
            }
            j13 = a13;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = this.f62819r;
            ue.c.H(obj);
        }
        i iVar = new i((NetworkResponse) obj, g.a(j13), null);
        NetworkResponse networkResponse = (NetworkResponse) iVar.f142319a;
        cVar.f62825d = true;
        boolean z13 = networkResponse instanceof xz.b;
        long j14 = iVar.f142320b;
        if (z13) {
            n nVar = (n) ((xz.b) networkResponse).f136205a;
            long e13 = zn2.b.e(j14);
            f1 f1Var = f1.COMPLIANCE_REQUIREMENTS_SUCCESS;
            HashMap hashMap = new HashMap();
            hashMap.put("time_in_ms", String.valueOf(e13));
            hashMap.put("compliance_requirements", CollectionsKt.Z(nVar.getRequirements(), ",", null, null, 0, null, null, 62));
            Unit unit = Unit.f80348a;
            cVar.f62822a.g(f1Var, null, hashMap, false);
            ArrayList arrayList = cVar.f62824c;
            arrayList.clear();
            arrayList.addAll(nVar.getRequirements());
        } else if (networkResponse instanceof xz.a) {
            cVar.c(((xz.a) networkResponse).a(), dl2.b.B(zn2.b.e(j14)));
        }
        return Unit.f80348a;
    }
}
