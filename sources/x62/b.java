package x62;

import com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditMaskImageView f133961b;

    public /* synthetic */ b(EditMaskImageView editMaskImageView, int i13) {
        this.f133960a = i13;
        this.f133961b = editMaskImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f133960a;
        EditMaskImageView this$0 = this.f133961b;
        switch (i13) {
            case 0:
                ql2.g gVar = EditMaskImageView.f51946q;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f51956j.clear();
                this$0.f51957k.clear();
                this$0.post(new b(this$0, 1));
                break;
            default:
                ql2.g gVar2 = EditMaskImageView.f51946q;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int size = this$0.f51956j.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                this$0.f51950d.d(size, this$0.f51957k.size());
                break;
        }
    }
}
