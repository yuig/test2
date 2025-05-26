package s80;

import com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class y2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f111855b;

    public /* synthetic */ y2(int i13, Function1 function1) {
        this.f111854a = i13;
        this.f111855b = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f111854a;
        Function1 onComplete = this.f111855b;
        switch (i13) {
            case 0:
                onComplete.invoke(f1.f111525a);
                break;
            default:
                ql2.g gVar = EditMaskImageView.f51946q;
                Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
                onComplete.invoke(null);
                break;
        }
    }
}
