package kotlin.collections;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f80351i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f80351i = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(Object obj) {
        return obj == this.f80351i ? "(this Collection)" : String.valueOf(obj);
    }
}
