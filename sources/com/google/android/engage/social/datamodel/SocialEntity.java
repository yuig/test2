package com.google.android.engage.social.datamodel;

import android.net.Uri;
import com.google.android.engage.common.datamodel.Entity;
import com.google.android.gms.common.annotation.KeepName;
import java.util.List;

@KeepName
/* loaded from: classes3.dex */
public abstract class SocialEntity extends Entity {

    /* renamed from: f, reason: collision with root package name */
    public final Uri f30312f;

    /* renamed from: g, reason: collision with root package name */
    public final List f30313g;

    public SocialEntity(int i13, List list, Uri uri, List list2) {
        super(i13, list);
        bf.b.j("Action Link Uri is a required field.", uri != null);
        this.f30312f = uri;
        this.f30313g = list2;
    }
}
