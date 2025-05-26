package x61;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((View.OnClickListener) this.receiver).onClick((View) obj);
        return Unit.f80348a;
    }
}
