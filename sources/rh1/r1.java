package rh1;

import android.text.Editable;
import com.pinterest.activity.pin.view.unifiedcomments.NewCommentTextEdit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewCommentTextEdit f108280b;

    public /* synthetic */ r1(NewCommentTextEdit newCommentTextEdit, int i13) {
        this.f108279a = i13;
        this.f108280b = newCommentTextEdit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f108279a;
        NewCommentTextEdit this_apply = this.f108280b;
        switch (i13) {
            case 0:
                int i14 = v1.S0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Editable text = this_apply.getText();
                this_apply.setSelection(text != null ? text.length() : 0);
                break;
            default:
                int i15 = v1.S0;
                hf0.b.t(this_apply.getContext());
                break;
        }
    }
}
