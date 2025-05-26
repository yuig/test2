package e21;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends va.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ va.f f56943c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f56944d;

    public e(ViewGroup viewGroup, va.f fVar, int i13) {
        this.f56942b = i13;
        this.f56944d = viewGroup;
        this.f56943c = fVar;
    }

    @Override // va.c
    public final void a(Drawable drawable) {
        int i13 = this.f56942b;
        va.f fVar = this.f56943c;
        ViewGroup viewGroup = this.f56944d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                ((f) viewGroup).post(new d(fVar, 0));
                break;
            default:
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                ((d61.b) viewGroup).post(new d(fVar, 1));
                break;
        }
    }
}
