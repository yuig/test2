package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0012¢\u0006\u0004\b\u0013\u0010\u0014B)\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/pinterest/api/model/hi;", "", "", "a", "I", "_avatarSize", "b", "_avatarPlacement", "", "<set-?>", "c", "Z", "d", "()Z", "showDetails", "Ljava/lang/Integer;", "getMetadataType", "()Ljava/lang/Integer;", "metadataType", "<init>", "()V", "avatarSize", "avatarPlacement", "(IIZI)V", "com/pinterest/api/model/gi", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class hi {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("avatar_size")
    private int _avatarSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("avatar_placement")
    private int _avatarPlacement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("show_details")
    private boolean showDetails;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("metadata_type")
    private Integer metadataType;

    static {
        new gi(null);
    }

    private hi() {
        this.showDetails = true;
    }

    public final z32.q1 a() {
        z32.o1 o1Var = z32.q1.Companion;
        int i13 = this._avatarPlacement;
        o1Var.getClass();
        return z32.o1.a(i13);
    }

    public final z32.v0 b() {
        z32.t0 t0Var = z32.v0.Companion;
        int i13 = this._avatarSize;
        t0Var.getClass();
        if (i13 == 0) {
            return z32.v0.DEFAULT;
        }
        if (i13 == 1) {
            return z32.v0.SMALL;
        }
        if (i13 == 2) {
            return z32.v0.MEDIUM;
        }
        if (i13 != 3) {
            return null;
        }
        return z32.v0.LARGE;
    }

    public final z32.t1 c() {
        Integer num = this.metadataType;
        if (num != null) {
            int intValue = num.intValue();
            z32.t1.Companion.getClass();
            z32.t1 t1Var = intValue != 0 ? intValue != 1 ? intValue != 2 ? null : z32.t1.REACTION_COUNT : z32.t1.REASON : z32.t1.NONE;
            if (t1Var != null) {
                return t1Var;
            }
        }
        return z32.t1.REASON;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getShowDetails() {
        return this.showDetails;
    }

    public hi(int i13, int i14, boolean z13, int i15) {
        this._avatarSize = i13;
        this._avatarPlacement = i14;
        this.showDetails = z13;
        this.metadataType = Integer.valueOf(i15);
    }
}
