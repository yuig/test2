package u21;

import android.content.Context;
import androidx.appcompat.widget.c2;
import ao2.j0;
import ao2.v0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f120104a;

    /* renamed from: b, reason: collision with root package name */
    public final rw0.f f120105b;

    /* renamed from: c, reason: collision with root package name */
    public final c2 f120106c;

    /* renamed from: d, reason: collision with root package name */
    public final ll.j f120107d;

    /* renamed from: e, reason: collision with root package name */
    public final w21.b0 f120108e;

    public o(Context context, rw0.f mediaGalleryUtils, c2 sharesheetUtils, ll.j screenNavigator, w21.b0 pinOrSpinSelectionRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaGalleryUtils, "mediaGalleryUtils");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(pinOrSpinSelectionRepository, "pinOrSpinSelectionRepository");
        this.f120104a = context;
        this.f120105b = mediaGalleryUtils;
        this.f120106c = sharesheetUtils;
        this.f120107d = screenNavigator;
        this.f120108e = pinOrSpinSelectionRepository;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        a0 request = (a0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof x) {
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new k(this, request, scope, null), 2);
        } else if (request instanceof y) {
            ko2.f fVar2 = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new l(this, request, null), 2);
        }
    }
}
