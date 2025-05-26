package kotlin.collections;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f80383i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar) {
        super(1);
        this.f80383i = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(@NotNull Map.Entry<Object, Object> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m mVar = this.f80383i;
        mVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        Object key = it.getKey();
        sb3.append(key == mVar ? "(this Map)" : String.valueOf(key));
        sb3.append('=');
        Object value = it.getValue();
        sb3.append(value != mVar ? String.valueOf(value) : "(this Map)");
        return sb3.toString();
    }
}
