package ed;

import a.cb;
import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloParseException;
import com.google.firebase.messaging.q;
import do2.j0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lb.l0;
import pc.o0;
import pc.v;

/* loaded from: classes.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public long f58474r;

    /* renamed from: s, reason: collision with root package name */
    public int f58475s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f58476t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f58477u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f58478v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pc.f f58479w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v f58480x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, q qVar, pc.f fVar, v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f58477u = mVar;
        this.f58478v = qVar;
        this.f58479w = fVar;
        this.f58480x = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f58477u, this.f58478v, this.f58479w, this.f58480x, cVar);
        iVar.f58476t = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        do2.j jVar;
        long currentTimeMillis;
        Object a13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f58475s;
        m mVar = this.f58477u;
        if (i13 == 0) {
            ue.c.H(obj);
            jVar = (do2.j) this.f58476t;
            int i14 = cd.b.f27547a;
            currentTimeMillis = System.currentTimeMillis();
            ArrayList interceptors = CollectionsKt.m0(mVar.f58495e, mVar.f58493c);
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            this.f58476t = jVar;
            this.f58474r = currentTimeMillis;
            this.f58475s = 1;
            if (interceptors.size() <= 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            e eVar = (e) interceptors.get(0);
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            a13 = ((f) eVar).f58465a.f58492b.a(this.f58478v, this);
            if (a13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2 && i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            currentTimeMillis = this.f58474r;
            jVar = (do2.j) this.f58476t;
            ue.c.H(obj);
            a13 = obj;
        }
        do2.j jVar2 = jVar;
        long j13 = currentTimeMillis;
        qc.i iVar = (qc.i) a13;
        int i15 = iVar.f103433a;
        List list = iVar.f103434b;
        wo2.l lVar = null;
        if (200 > i15 || i15 >= 300) {
            if (mVar.d()) {
                lVar = iVar.a();
            } else {
                wo2.l a14 = iVar.a();
                if (a14 != null) {
                    a14.close();
                }
            }
            StringBuilder sb3 = new StringBuilder("Http request failed with status code `");
            int i16 = iVar.f103433a;
            throw new ApolloHttpException(i16, list, lVar, cb.l(sb3, i16, '`'));
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String B0 = com.bumptech.glide.d.B0(list);
        v vVar = this.f58480x;
        pc.f fVar = this.f58479w;
        if (B0 == null || !z.p(B0, "multipart/", true)) {
            o0 o0Var = fVar.f99541a;
            int i17 = m.f58490f;
            mVar.getClass();
            try {
                wo2.l a15 = iVar.a();
                Intrinsics.f(a15);
                Intrinsics.checkNotNullParameter(a15, "<this>");
                pc.g b13 = com.bumptech.glide.c.N0(vVar, o0Var, new tc.c(a15)).b();
                b13.f99557g = true;
                pc.h c13 = m.c(mVar, b13.b(), fVar.f99542b, iVar, j13);
                this.f58476t = null;
                this.f58475s = 3;
                if (jVar2.emit(c13, this) == aVar) {
                    return aVar;
                }
            } catch (Exception e13) {
                int i18 = m.f58490f;
                if (e13 instanceof ApolloException) {
                    throw ((ApolloException) e13);
                }
                throw new ApolloParseException("Failed to parse GraphQL http network response", e13);
            }
        } else {
            j0 b14 = m.b(mVar, fVar.f99541a, vVar, iVar);
            this.f58476t = null;
            this.f58475s = 2;
            l0.a0(jVar2);
            Object collect = b14.collect(new h(jVar2, this.f58477u, this.f58479w, iVar, j13), this);
            if (collect != aVar) {
                collect = Unit.f80348a;
            }
            if (collect != aVar) {
                collect = Unit.f80348a;
            }
            if (collect == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
