package y80;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Ly80/a;", "", "Ljava/util/ArrayList;", "Ly80/c;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "sections", "composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("sections")
    @NotNull
    private final ArrayList<c> sections;

    public a() {
        ArrayList<c> sections = new ArrayList<>();
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.sections = sections;
    }

    /* renamed from: a, reason: from getter */
    public final ArrayList getSections() {
        return this.sections;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.sections, ((a) obj).sections);
    }

    public final int hashCode() {
        return this.sections.hashCode();
    }

    public final String toString() {
        return "ComposerPlacementDisplayData(sections=" + this.sections + ")";
    }
}
