package bd;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final do2.j f22681a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g owner) {
        super("Flow was aborted, no more elements needed");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f22681a = owner;
    }
}
