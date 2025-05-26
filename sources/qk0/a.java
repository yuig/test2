package qk0;

import com.pinterest.api.model.v7;
import dl1.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final List f104044a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104045b;

    /* renamed from: c, reason: collision with root package name */
    public final String f104046c;

    public a(@NotNull List<? extends v7> boards, String str, @NotNull String boardId) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f104044a = boards;
        this.f104045b = str;
        this.f104046c = boardId;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return a.a.d("MORE_BOARDS_", this.f104044a.size());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f104044a, aVar.f104044a) && Intrinsics.d(this.f104045b, aVar.f104045b) && Intrinsics.d(this.f104046c, aVar.f104046c);
    }

    public final int hashCode() {
        int hashCode = this.f104044a.hashCode() * 31;
        String str = this.f104045b;
        return this.f104046c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MoreBoardsModel(boards=");
        sb3.append(this.f104044a);
        sb3.append(", userName=");
        sb3.append(this.f104045b);
        sb3.append(", boardId=");
        return a.a.p(sb3, this.f104046c, ")");
    }
}
