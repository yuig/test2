package om1;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public rm1.m f96676a;

    /* renamed from: b, reason: collision with root package name */
    public e f96677b;

    /* renamed from: c, reason: collision with root package name */
    public f f96678c;

    /* renamed from: d, reason: collision with root package name */
    public fm1.c f96679d;

    /* renamed from: e, reason: collision with root package name */
    public i0 f96680e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96681f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f96682g;

    /* renamed from: h, reason: collision with root package name */
    public int f96683h;

    /* renamed from: i, reason: collision with root package name */
    public int f96684i;

    /* renamed from: j, reason: collision with root package name */
    public fm1.a f96685j;

    public q(c displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f96676a = displayState.f96639a;
        this.f96677b = displayState.f96640b;
        this.f96678c = displayState.f96641c;
        this.f96679d = displayState.f96642d;
        this.f96680e = displayState.f96643e;
        this.f96681f = displayState.f96644f;
        this.f96682g = displayState.f96645g;
        this.f96683h = displayState.f96646h;
        this.f96684i = displayState.f96647i;
        this.f96685j = displayState.f96648j;
    }

    public final void a(rm1.m icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f96676a = icon;
    }

    public final void b() {
        this.f96682g = new f0("Label");
    }

    public final void c(e size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f96677b = size;
    }

    public final void d(f style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f96678c = style;
    }

    public final void e(fm1.c visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f96679d = visibility;
    }
}
