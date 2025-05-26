package hn0;

import android.media.MediaCodec;
import co2.y;
import co2.z;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xk2.q;
import xk2.r;
import xk2.s;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f69615r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f69616s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f69617t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f69617t = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f69617t, cVar);
        dVar.f69616s = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f69615r;
        if (i13 == 0) {
            ue.c.H(obj);
            z scope = (z) this.f69616s;
            e eVar = this.f69617t;
            bn0.c cVar = eVar.f69621d;
            MediaCodec mediaCodec = eVar.f69620c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(scope, "scope");
            cVar.f23565a = scope;
            try {
                mediaCodec.start();
            } catch (MediaCodec.CodecException e13) {
                bn0.d dVar = new bn0.d(mediaCodec, e13);
                Intrinsics.checkNotNullParameter(scope, "<this>");
                try {
                    q qVar = s.f135225b;
                    m13 = Boolean.valueOf(!(((y) scope).f28359d.g(dVar) instanceof co2.s));
                } catch (Throwable th3) {
                    q qVar2 = s.f135225b;
                    m13 = ue.c.m(th3);
                }
                Object obj2 = Boolean.FALSE;
                if (m13 instanceof r) {
                    m13 = obj2;
                }
                ((y) scope).r(e13);
            }
            a aVar2 = a.f69608j;
            this.f69615r = 1;
            if (dl2.b.w(scope, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
