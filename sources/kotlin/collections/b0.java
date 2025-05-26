package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object[] f80354i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Object[] objArr) {
        super(0);
        this.f80354i = objArr;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Iterator<Object> invoke() {
        return com.bumptech.glide.c.D0(this.f80354i);
    }
}
