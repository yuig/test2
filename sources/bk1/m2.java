package bk1;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m2 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final ac2.o1 f23269a;

    /* renamed from: b, reason: collision with root package name */
    public final bc2.e f23270b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f23271c;

    public m2(ac2.o1 videoManager, bc2.e mp4TrackSelector, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(mp4TrackSelector, "mp4TrackSelector");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f23269a = videoManager;
        this.f23270b = mp4TrackSelector;
        this.f23271c = eventManager;
    }

    public static bo2.e j(i1 effectRequest) {
        Intrinsics.checkNotNullParameter(effectRequest, "effectRequest");
        ko2.f fVar = ao2.v0.f20219a;
        return ((bo2.e) ho2.q.f69782a).f23612f;
    }

    @Override // l82.g
    public final /* bridge */ /* synthetic */ CoroutineContext f(l82.h hVar) {
        return j((i1) hVar);
    }

    @Override // l82.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void e(ao2.j0 scope, i1 request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof h1) {
            ko2.f fVar = ao2.v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ((bo2.e) ho2.q.f69782a).f23612f, null, new k2(this, request, null), 2);
            return;
        }
        if (request instanceof g1) {
            ko2.f fVar2 = ao2.v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ((bo2.e) ho2.q.f69782a).f23612f, null, new l2(this, request, null), 2);
            return;
        }
        boolean z13 = request instanceof e1;
        m60.w wVar = this.f23271c;
        if (z13) {
            wVar.d(new ls1.a(((e1) request).j().getUid()));
        } else if (request instanceof f1) {
            wVar.d(new ls1.b(((f1) request).j().getUid()));
        }
    }
}
