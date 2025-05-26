package com.pinterest.feature.ideaPinCreation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.feature.ideaPinCreation.closeup.view.q;
import com.pinterest.framework.screens.ScreenLocation;
import ev0.d;
import ev0.l;
import fv0.b;
import hu0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv0.k;
import mv0.r;
import mv0.t;
import mv0.y;
import org.jetbrains.annotations.NotNull;
import ot0.i;
import su0.o;
import tt0.l0;
import tv0.h;
import tv0.j;
import uu0.c;
import zu0.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/screen/IdeaPinCreationLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/ideaPinCreation/screen/a", "IDEA_PIN_BRAND_PARTNER_MANAGEMENT", "PIN_INTEREST_TAGGING", "IDEA_PIN_PARTNER_TAGGING", "IDEA_PIN_USER_TAGGING", "IDEA_PIN_BOARD_STICKER_PICKER", "STORY_PIN_PRODUCT_TAGGING", "STORY_PIN_AFFILIATE_PRODUCT_TAGGING", "STORY_PIN_PRODUCT_AFFILIATE_LINK_FEED", "STORY_PIN_PRODUCT_SEARCH", "IDEA_PIN_STICKER_BROWSE", "IDEA_PIN_STICKER_CATEGORY", "STORY_PIN_VIDEO_TRIMMING", "IDEA_PIN_DRAFTS", "STORY_PIN_CREATION_CAMERA", "STORY_PIN_CREATION_CLOSEUP", "IDEA_PIN_COVER_IMAGE_PICKER", "STORY_PIN_CREATION_METADATA_LIST", "IDEA_PIN_METADATA_ADVANCED_SETTINGS", "IDEA_PIN_CREATION_CANVAS", "IDEA_PIN_CREATION_PRODUCT_TAG_LIST", "IDEA_PIN_OVERLAY_DURATION", "OVERLAY_TRANSITION_SELECTION", "IDEA_PIN_EDUCATION", "IDEA_PIN_EDUCATION_SLIDE", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class IdeaPinCreationLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ IdeaPinCreationLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<IdeaPinCreationLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final IdeaPinCreationLocation IDEA_PIN_BRAND_PARTNER_MANAGEMENT = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_BRAND_PARTNER_MANAGEMENT

        /* renamed from: a, reason: collision with root package name */
        public final Class f46565a = d.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46565a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final IdeaPinCreationLocation PIN_INTEREST_TAGGING = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.PIN_INTEREST_TAGGING

        /* renamed from: a, reason: collision with root package name */
        public final Class f46585a = g.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46585a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_PARTNER_TAGGING = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_PARTNER_TAGGING

        /* renamed from: a, reason: collision with root package name */
        public final Class f46574a = h.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46574a;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_USER_TAGGING = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_USER_TAGGING

        /* renamed from: a, reason: collision with root package name */
        public final Class f46579a = j.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46580b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46581c = true;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46579a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46594b() {
            return this.f46580b;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF46595c() {
            return this.f46581c;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_BOARD_STICKER_PICKER = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_BOARD_STICKER_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final Class f46562a = i.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46563b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46564c = true;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46562a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46594b() {
            return this.f46563b;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF46595c() {
            return this.f46564c;
        }
    };
    public static final IdeaPinCreationLocation STORY_PIN_PRODUCT_TAGGING = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.STORY_PIN_PRODUCT_TAGGING

        /* renamed from: a, reason: collision with root package name */
        public final Class f46593a = t.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46594b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46595c = true;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46593a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46594b() {
            return this.f46594b;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF46595c() {
            return this.f46595c;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final IdeaPinCreationLocation STORY_PIN_AFFILIATE_PRODUCT_TAGGING = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.STORY_PIN_AFFILIATE_PRODUCT_TAGGING

        /* renamed from: a, reason: collision with root package name */
        public final Class f46586a = k.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46586a;
        }
    };
    public static final IdeaPinCreationLocation STORY_PIN_PRODUCT_AFFILIATE_LINK_FEED = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.STORY_PIN_PRODUCT_AFFILIATE_LINK_FEED

        /* renamed from: a, reason: collision with root package name */
        public final Class f46591a = mv0.i.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46591a;
        }
    };
    public static final IdeaPinCreationLocation STORY_PIN_PRODUCT_SEARCH = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.STORY_PIN_PRODUCT_SEARCH

        /* renamed from: a, reason: collision with root package name */
        public final Class f46592a = r.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46592a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_STICKER_BROWSE = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_STICKER_BROWSE

        /* renamed from: a, reason: collision with root package name */
        public final Class f46575a = qv0.g.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46575a;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_STICKER_CATEGORY = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_STICKER_CATEGORY

        /* renamed from: a, reason: collision with root package name */
        public final Class f46576a = qv0.j.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46577b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46578c = true;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46576a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46594b() {
            return this.f46577b;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF46595c() {
            return this.f46578c;
        }
    };
    public static final IdeaPinCreationLocation STORY_PIN_VIDEO_TRIMMING = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.STORY_PIN_VIDEO_TRIMMING

        /* renamed from: a, reason: collision with root package name */
        public final Class f46596a = zv0.j.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46596a;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_DRAFTS = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_DRAFTS

        /* renamed from: a, reason: collision with root package name */
        public final Class f46569a = nu0.i.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46569a;
        }
    };
    public static final IdeaPinCreationLocation STORY_PIN_CREATION_CAMERA = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.STORY_PIN_CREATION_CAMERA

        /* renamed from: a, reason: collision with root package name */
        public final Class f46587a = l0.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46587a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final IdeaPinCreationLocation STORY_PIN_CREATION_CLOSEUP = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.STORY_PIN_CREATION_CLOSEUP

        /* renamed from: a, reason: collision with root package name */
        public final Class f46588a = q.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46588a;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_COVER_IMAGE_PICKER = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_COVER_IMAGE_PICKER

        /* renamed from: a, reason: collision with root package name */
        public final Class f46566a = e.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46566a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final IdeaPinCreationLocation STORY_PIN_CREATION_METADATA_LIST = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.STORY_PIN_CREATION_METADATA_LIST

        /* renamed from: a, reason: collision with root package name */
        public final Class f46589a = l.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46590b = true;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46589a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF46595c() {
            return this.f46590b;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_METADATA_ADVANCED_SETTINGS = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_METADATA_ADVANCED_SETTINGS

        /* renamed from: a, reason: collision with root package name */
        public final Class f46572a = b.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46572a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_CREATION_CANVAS = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_CREATION_CANVAS

        /* renamed from: a, reason: collision with root package name */
        public final Class f46567a = xt0.g.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46567a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_CREATION_PRODUCT_TAG_LIST = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_CREATION_PRODUCT_TAG_LIST

        /* renamed from: a, reason: collision with root package name */
        public final Class f46568a = y.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46568a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_OVERLAY_DURATION = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_OVERLAY_DURATION

        /* renamed from: a, reason: collision with root package name */
        public final Class f46573a = su0.i.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46573a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final IdeaPinCreationLocation OVERLAY_TRANSITION_SELECTION = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.OVERLAY_TRANSITION_SELECTION

        /* renamed from: a, reason: collision with root package name */
        public final Class f46582a = o.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46583b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46584c = true;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46582a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF46594b() {
            return this.f46583b;
        }

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF46595c() {
            return this.f46584c;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_EDUCATION = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_EDUCATION

        /* renamed from: a, reason: collision with root package name */
        public final Class f46570a = tu0.h.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46570a;
        }
    };
    public static final IdeaPinCreationLocation IDEA_PIN_EDUCATION_SLIDE = new IdeaPinCreationLocation() { // from class: com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation.IDEA_PIN_EDUCATION_SLIDE

        /* renamed from: a, reason: collision with root package name */
        public final Class f46571a = c.class;

        @Override // com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF46596a() {
            return this.f46571a;
        }
    };

    private static final /* synthetic */ IdeaPinCreationLocation[] $values() {
        return new IdeaPinCreationLocation[]{IDEA_PIN_BRAND_PARTNER_MANAGEMENT, PIN_INTEREST_TAGGING, IDEA_PIN_PARTNER_TAGGING, IDEA_PIN_USER_TAGGING, IDEA_PIN_BOARD_STICKER_PICKER, STORY_PIN_PRODUCT_TAGGING, STORY_PIN_AFFILIATE_PRODUCT_TAGGING, STORY_PIN_PRODUCT_AFFILIATE_LINK_FEED, STORY_PIN_PRODUCT_SEARCH, IDEA_PIN_STICKER_BROWSE, IDEA_PIN_STICKER_CATEGORY, STORY_PIN_VIDEO_TRIMMING, IDEA_PIN_DRAFTS, STORY_PIN_CREATION_CAMERA, STORY_PIN_CREATION_CLOSEUP, IDEA_PIN_COVER_IMAGE_PICKER, STORY_PIN_CREATION_METADATA_LIST, IDEA_PIN_METADATA_ADVANCED_SETTINGS, IDEA_PIN_CREATION_CANVAS, IDEA_PIN_CREATION_PRODUCT_TAG_LIST, IDEA_PIN_OVERLAY_DURATION, OVERLAY_TRANSITION_SELECTION, IDEA_PIN_EDUCATION, IDEA_PIN_EDUCATION_SLIDE};
    }

    static {
        IdeaPinCreationLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new a();
        CREATOR = new com.pinterest.feature.board.permissions.b(10);
    }

    public /* synthetic */ IdeaPinCreationLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static IdeaPinCreationLocation valueOf(String str) {
        return (IdeaPinCreationLocation) Enum.valueOf(IdeaPinCreationLocation.class, str);
    }

    public static IdeaPinCreationLocation[] values() {
        return (IdeaPinCreationLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF46895b() {
        return com.pinterest.framework.screens.g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF46596a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF46594b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF46595c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF44665b() {
        return super.getF44665b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF51723b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ boolean getSupportsStateRestorationOnlyUseInEmergencies() {
        return true;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public void onScreenNavigation() {
    }

    @Override // com.pinterest.framework.screens.ScreenLocation, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private IdeaPinCreationLocation(String str, int i13) {
    }
}
