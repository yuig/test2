package kb;

import androidx.work.ArrayCreatingInputMerger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 extends x0 {
    @Override // kb.x0
    public final y0 c() {
        if (this.f79049a && this.f79051c.f117025j.f78992d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }
        Intrinsics.checkNotNullParameter(this, "builder");
        return new f0(this.f79050b, this.f79051c, this.f79052d);
    }

    @Override // kb.x0
    public final x0 d() {
        return this;
    }

    public final void i() {
        Intrinsics.checkNotNullParameter(ArrayCreatingInputMerger.class, "inputMerger");
        tb.s sVar = this.f79051c;
        String name = ArrayCreatingInputMerger.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "inputMerger.name");
        sVar.f117019d = name;
    }
}
