package com.iab.omid.library.pinterest.adsession.media;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;

/* loaded from: classes3.dex */
public enum a {
    CLICK(SbaPinRep.CLOSEUP_NAVIGATION_TYPE_CLICK),
    INVITATION_ACCEPTED("invitationAccept");

    String interactionType;

    a(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }
}
