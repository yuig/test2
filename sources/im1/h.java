package im1;

import android.view.KeyEvent;
import android.view.View;
import com.google.firebase.messaging.q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f72647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f72648b;

    public /* synthetic */ h(q qVar, Function2 function2) {
        this.f72647a = qVar;
        this.f72648b = function2;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
        q this$0 = this.f72647a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function2 makeKeyEvent = this.f72648b;
        Intrinsics.checkNotNullParameter(makeKeyEvent, "$makeKeyEvent");
        this$0.s((gm1.c) makeKeyEvent.invoke(Integer.valueOf(i13), keyEvent));
        return false;
    }
}
