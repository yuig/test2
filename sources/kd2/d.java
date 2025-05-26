package kd2;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f79264i = "GLRenderThread";

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f79265j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Function0 function0) {
        super(0);
        this.f79265j = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Log.d(this.f79264i, (String) this.f79265j.invoke());
        return Unit.f80348a;
    }
}
