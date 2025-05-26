package im1;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.firebase.messaging.q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f72655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f72656b;

    public /* synthetic */ k(q qVar, Function2 function2) {
        this.f72655a = qVar;
        this.f72656b = function2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
        q this$0 = this.f72655a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function2 makeEditorActionEvent = this.f72656b;
        Intrinsics.checkNotNullParameter(makeEditorActionEvent, "$makeEditorActionEvent");
        this$0.s((gm1.c) makeEditorActionEvent.invoke(Integer.valueOf(i13), keyEvent));
        return false;
    }
}
