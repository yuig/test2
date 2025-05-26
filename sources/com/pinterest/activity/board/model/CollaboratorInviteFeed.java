package com.pinterest.activity.board.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.deserializer.CollaboratorInviteDeserializer;
import com.pinterest.api.model.pc;
import com.pinterest.api.model.qc;
import com.pinterest.api.model.v7;
import java.util.List;
import oi.e7;
import vd0.c;

@Deprecated
/* loaded from: classes.dex */
public class CollaboratorInviteFeed extends Feed<qc> {
    public static final Parcelable.Creator<CollaboratorInviteFeed> CREATOR = new e7(22);

    public CollaboratorInviteFeed(c cVar, String str, CollaboratorInviteDeserializer collaboratorInviteDeserializer) {
        this(cVar, str, null, false, collaboratorInviteDeserializer);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        return null;
    }

    public CollaboratorInviteFeed() {
        super(null, null);
    }

    public CollaboratorInviteFeed(c cVar, String str, v7 v7Var, boolean z13, CollaboratorInviteDeserializer collaboratorInviteDeserializer) {
        super(cVar, str);
        H(collaboratorInviteDeserializer.c(cVar.k("data")));
        if (!z13 || v7Var == null || v7Var.k1() == null) {
            return;
        }
        qc qcVar = new qc();
        qcVar.e(null);
        qcVar.g(pc.OWNER);
        h(qcVar);
    }

    public CollaboratorInviteFeed(Parcel parcel) {
        super(parcel);
    }
}
