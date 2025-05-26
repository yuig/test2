package j10;

import com.pinterest.api.model.f30;
import dl1.t;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final fl1.e f74355a;

    /* renamed from: b, reason: collision with root package name */
    public final se2.a f74356b;

    /* renamed from: c, reason: collision with root package name */
    public final d12.i f74357c;

    public g(@NotNull fl1.e pinModelMerger, @NotNull se2.a lazyPinRepository, @NotNull d12.i repositoryBatcher) {
        Intrinsics.checkNotNullParameter(pinModelMerger, "pinModelMerger");
        Intrinsics.checkNotNullParameter(lazyPinRepository, "lazyPinRepository");
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        this.f74355a = pinModelMerger;
        this.f74356b = lazyPinRepository;
        this.f74357c = repositoryBatcher;
    }

    public final void a(List pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        Iterator it = pins.iterator();
        while (it.hasNext()) {
            ((dl1.l) ((t) ((bf2.b) this.f74356b).get())).Z((f30) it.next());
        }
        new f(pins, this).b();
    }

    public final f30 b(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        String id3 = pin.getId();
        t tVar = (t) ((bf2.b) this.f74356b).get();
        Intrinsics.f(id3);
        f30 f30Var = (f30) ((dl1.l) tVar).O(id3);
        return f30Var != null ? (f30) this.f74355a.a(f30Var, pin) : pin;
    }
}
