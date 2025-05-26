package com.google.android.engage.food.datamodel;

import android.net.Uri;
import bf.b;
import com.google.android.engage.common.datamodel.Entity;
import com.google.android.engage.common.datamodel.Rating;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;

@KeepName
/* loaded from: classes3.dex */
public abstract class FoodEntity extends Entity {

    /* renamed from: f, reason: collision with root package name */
    public final Uri f30279f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30280g;

    /* renamed from: h, reason: collision with root package name */
    public final Rating f30281h;

    public FoodEntity(int i13, ArrayList arrayList, Uri uri, String str, Rating rating) {
        super(i13, arrayList);
        b.j("Action link Uri cannot be empty", uri != null);
        this.f30279f = uri;
        this.f30280g = str;
        this.f30281h = rating;
    }
}
