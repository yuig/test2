package z71;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lz71/g;", "Lz71/i;", "Lz71/f;", "a", "Lz71/f;", "()Lz71/f;", "config", "Lz71/a;", "b", "Lz71/a;", "d", "()Lz71/a;", "backgroundItem", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class g extends i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("config")
    @NotNull
    private final f config;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("backgroundItem")
    @NotNull
    private final a backgroundItem;

    public g(f config, a backgroundItem) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(backgroundItem, "backgroundItem");
        this.config = config;
        this.backgroundItem = backgroundItem;
    }

    public static g c(g gVar, f config) {
        a backgroundItem = gVar.backgroundItem;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(backgroundItem, "backgroundItem");
        return new g(config, backgroundItem);
    }

    @Override // z71.i
    /* renamed from: a, reason: from getter */
    public final f getConfig() {
        return this.config;
    }

    @Override // z71.i
    public final i b(a81.d update) {
        Intrinsics.checkNotNullParameter(update, "update");
        return c(this, (f) update.invoke(this.config));
    }

    /* renamed from: d, reason: from getter */
    public final a getBackgroundItem() {
        return this.backgroundItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(g.class, obj.getClass())) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.config, gVar.config) && Intrinsics.d(this.backgroundItem, gVar.backgroundItem);
    }

    public final int hashCode() {
        return this.backgroundItem.hashCode() + (this.config.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundOverlayItem(config=" + this.config + ", backgroundItem=" + this.backgroundItem + ")";
    }
}
