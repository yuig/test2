package f5;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements fe.d, ak2.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f61086a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61087b;

    public /* synthetic */ g(boolean z13, int i13) {
        this.f61086a = i13;
        this.f61087b = z13;
    }

    @Override // fe.d
    public boolean a(Object obj, fe.c cVar) {
        Drawable drawable = (Drawable) obj;
        ee.g gVar = (ee.g) cVar;
        Drawable drawable2 = ((ImageView) gVar.f58770a).getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f61087b);
        transitionDrawable.startTransition(this.f61086a);
        ((ImageView) gVar.f58770a).setImageDrawable(transitionDrawable);
        return true;
    }

    @Override // ak2.f
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.f61086a) {
        }
        return b((List) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List b(List updateUiChanges) {
        int i13 = this.f61086a;
        boolean z13 = this.f61087b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(updateUiChanges, "updateUiChanges");
                if (!z13) {
                    break;
                } else {
                    break;
                }
            case 1:
                Intrinsics.checkNotNullParameter(updateUiChanges, "updateUiChanges");
                if (!z13) {
                    break;
                } else {
                    break;
                }
            case 2:
                Intrinsics.checkNotNullParameter(updateUiChanges, "updateUiChanges");
                if (!z13) {
                    break;
                } else {
                    break;
                }
            case 3:
                Intrinsics.checkNotNullParameter(updateUiChanges, "updateUiChanges");
                if (!z13) {
                    break;
                } else {
                    break;
                }
            case 4:
                Intrinsics.checkNotNullParameter(updateUiChanges, "updateUiChanges");
                if (!z13) {
                    break;
                } else {
                    break;
                }
            case 5:
                Intrinsics.checkNotNullParameter(updateUiChanges, "updateUiChanges");
                if (!z13) {
                    break;
                } else {
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(updateUiChanges, "updateUiChanges");
                if (!z13) {
                    break;
                } else {
                    break;
                }
        }
        return CollectionsKt.H0(updateUiChanges);
    }

    public g() {
        this.f61087b = true;
        this.f61086a = 0;
    }
}
