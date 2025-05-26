package sp0;

import d7.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sf1.s;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f114885a;

    /* renamed from: b, reason: collision with root package name */
    public final a f114886b;

    /* renamed from: c, reason: collision with root package name */
    public final a f114887c;

    /* renamed from: d, reason: collision with root package name */
    public final float f114888d;

    /* renamed from: e, reason: collision with root package name */
    public final b f114889e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f114890f;

    /* renamed from: g, reason: collision with root package name */
    public final f f114891g;

    public e(d position, a targetDimensions, a canvasDimensions, float f13, b bVar, Function1 onTapCallback, s videoPlaybackProvider) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(targetDimensions, "targetDimensions");
        Intrinsics.checkNotNullParameter(canvasDimensions, "canvasDimensions");
        Intrinsics.checkNotNullParameter(onTapCallback, "onTapCallback");
        Intrinsics.checkNotNullParameter(videoPlaybackProvider, "videoPlaybackProvider");
        this.f114885a = position;
        this.f114886b = targetDimensions;
        this.f114887c = canvasDimensions;
        this.f114888d = f13;
        this.f114889e = bVar;
        this.f114890f = onTapCallback;
        this.f114891g = videoPlaybackProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f114885a, eVar.f114885a) && Intrinsics.d(this.f114886b, eVar.f114886b) && Intrinsics.d(this.f114887c, eVar.f114887c) && Float.compare(this.f114888d, eVar.f114888d) == 0 && Intrinsics.d(this.f114889e, eVar.f114889e) && Intrinsics.d(this.f114890f, eVar.f114890f) && Intrinsics.d(this.f114891g, eVar.f114891g);
    }

    public final int hashCode() {
        int a13 = a.a.a(this.f114888d, (this.f114887c.hashCode() + ((this.f114886b.hashCode() + (this.f114885a.hashCode() * 31)) * 31)) * 31, 31);
        b bVar = this.f114889e;
        return this.f114891g.hashCode() + g.c(this.f114890f, (a13 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "TapTargetViewModel(position=" + this.f114885a + ", targetDimensions=" + this.f114886b + ", canvasDimensions=" + this.f114887c + ", rotation=" + this.f114888d + ", duration=" + this.f114889e + ", onTapCallback=" + this.f114890f + ", videoPlaybackProvider=" + this.f114891g + ")";
    }
}
