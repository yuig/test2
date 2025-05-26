package jh0;

import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.f;
import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;
import rg0.n;

/* loaded from: classes5.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final n f76214a;

    /* renamed from: b, reason: collision with root package name */
    public ha.a f76215b;

    public e(n experience) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(experience, "experience");
        this.f76214a = experience;
    }

    public static boolean b(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        view.getGlobalVisibleRect(new Rect());
        Rect rect = new Rect(0, 0, hf0.b.f69002b, hf0.b.f69003c);
        return rect.contains(rect);
    }

    public final void a(boolean z13) {
        if (z13) {
            this.f76214a.c(null, null);
        }
        ha.a aVar = this.f76215b;
        if (aVar != null) {
            aVar.d();
        } else {
            Intrinsics.r("gestaltPopoverOverlay");
            throw null;
        }
    }

    @Override // androidx.lifecycle.f
    public final void onPause(z owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        a(true);
    }
}
