package j91;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f75105i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Drawable f75106j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Drawable drawable) {
        super(0);
        this.f75105i = dVar;
        this.f75106j = drawable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        d dVar = this.f75105i;
        dVar.f75116f = dVar.f(this.f75106j, dVar.b(), 4000L, 2.3f);
        return Unit.f80348a;
    }
}
