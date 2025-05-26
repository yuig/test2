package com.pinterest.feature.board.permissions;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.feature.boardsection.BoardSectionFeatureLocation;
import com.pinterest.feature.bubbles.screen.BubbleFeatureLocation;
import com.pinterest.feature.closeup.qcm.drawer.screen.QcmCloseupDrawerLocation;
import com.pinterest.feature.conversation.screen.ConversationFeatureLocation;
import com.pinterest.feature.creator.model.CreatorFeatureLocation;
import com.pinterest.feature.creator.savedboards.CreatorHubSavedBoardsLocation;
import com.pinterest.feature.didit.model.DidItFeatureLocation;
import com.pinterest.feature.engagementtab.screens.EngagementFeatureLocation;
import com.pinterest.feature.home.model.HomeFeedTunerLocation;
import com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation;
import com.pinterest.feature.location.LocationRequestLocation;
import com.pinterest.feature.mediagallery.screen.MediaGalleryLocation;
import com.pinterest.feature.newshub.model.NewsHubItemFeed;
import com.pinterest.feature.pear.screen.PearLocation;
import com.pinterest.feature.pin.PinFeatureModuleLocation;
import com.pinterest.feature.pin.RepinFeatureLocation;
import com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation;
import com.pinterest.feature.scheduledpins.screen.ScheduledPinsLocation;
import com.pinterest.feature.search.SearchFeatureLocation;
import com.pinterest.feature.search.results.goldstandard.viewpager.steps.GoldStandardStepsLocation;
import com.pinterest.feature.search.typeahead.model.SearchTypeaheadItemFeed;
import com.pinterest.feature.settings.SettingsProfileFeatureLocation;
import com.pinterest.feature.settings.SettingsSecurityFeatureLocation;
import com.pinterest.feature.settings.SettingsUnlinkBAFeatureLocation;
import com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation;
import com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation;
import com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation;
import com.pinterest.feature.settings.privacydata.SettingsPrivacyDataFeatureLocation;
import com.pinterest.feature.shopping.ShoppingFeatureLocation;

/* loaded from: classes5.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45305a;

    public /* synthetic */ b(int i13) {
        this.f45305a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f45305a) {
            case 0:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString = parcel.readString();
                    if (readString != null) {
                        return BoardPermissionsFeatureLocation.valueOf(readString);
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString2 = parcel.readString();
                    if (readString2 != null) {
                        return BoardSectionFeatureLocation.valueOf(readString2);
                    }
                    return null;
                } catch (Throwable unused2) {
                    return null;
                }
            case 2:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString3 = parcel.readString();
                    if (readString3 != null) {
                        return BubbleFeatureLocation.valueOf(readString3);
                    }
                    return null;
                } catch (Throwable unused3) {
                    return null;
                }
            case 3:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString4 = parcel.readString();
                    if (readString4 != null) {
                        return QcmCloseupDrawerLocation.valueOf(readString4);
                    }
                    return null;
                } catch (Throwable unused4) {
                    return null;
                }
            case 4:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString5 = parcel.readString();
                    if (readString5 != null) {
                        return ConversationFeatureLocation.valueOf(readString5);
                    }
                    return null;
                } catch (Throwable unused5) {
                    return null;
                }
            case 5:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString6 = parcel.readString();
                    if (readString6 != null) {
                        return CreatorFeatureLocation.valueOf(readString6);
                    }
                    return null;
                } catch (Throwable unused6) {
                    return null;
                }
            case 6:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString7 = parcel.readString();
                    if (readString7 != null) {
                        return CreatorHubSavedBoardsLocation.valueOf(readString7);
                    }
                    return null;
                } catch (Throwable unused7) {
                    return null;
                }
            case 7:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString8 = parcel.readString();
                    if (readString8 != null) {
                        return DidItFeatureLocation.valueOf(readString8);
                    }
                    return null;
                } catch (Throwable unused8) {
                    return null;
                }
            case 8:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString9 = parcel.readString();
                    if (readString9 != null) {
                        return EngagementFeatureLocation.valueOf(readString9);
                    }
                    return null;
                } catch (Throwable unused9) {
                    return null;
                }
            case 9:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString10 = parcel.readString();
                    if (readString10 != null) {
                        return HomeFeedTunerLocation.valueOf(readString10);
                    }
                    return null;
                } catch (Throwable unused10) {
                    return null;
                }
            case 10:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString11 = parcel.readString();
                    if (readString11 != null) {
                        return IdeaPinCreationLocation.valueOf(readString11);
                    }
                    return null;
                } catch (Throwable unused11) {
                    return null;
                }
            case 11:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString12 = parcel.readString();
                    if (readString12 != null) {
                        return LocationRequestLocation.valueOf(readString12);
                    }
                    return null;
                } catch (Throwable unused12) {
                    return null;
                }
            case 12:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString13 = parcel.readString();
                    if (readString13 != null) {
                        return MediaGalleryLocation.valueOf(readString13);
                    }
                    return null;
                } catch (Throwable unused13) {
                    return null;
                }
            case 13:
                return new NewsHubItemFeed(parcel);
            case 14:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString14 = parcel.readString();
                    if (readString14 != null) {
                        return PearLocation.valueOf(readString14);
                    }
                    return null;
                } catch (Throwable unused14) {
                    return null;
                }
            case 15:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString15 = parcel.readString();
                    if (readString15 != null) {
                        return PinFeatureModuleLocation.valueOf(readString15);
                    }
                    return null;
                } catch (Throwable unused15) {
                    return null;
                }
            case 16:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString16 = parcel.readString();
                    if (readString16 != null) {
                        return RepinFeatureLocation.valueOf(readString16);
                    }
                    return null;
                } catch (Throwable unused16) {
                    return null;
                }
            case 17:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString17 = parcel.readString();
                    if (readString17 != null) {
                        return PinOrSpinFeatureLocation.valueOf(readString17);
                    }
                    return null;
                } catch (Throwable unused17) {
                    return null;
                }
            case 18:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString18 = parcel.readString();
                    if (readString18 != null) {
                        return ScheduledPinsLocation.valueOf(readString18);
                    }
                    return null;
                } catch (Throwable unused18) {
                    return null;
                }
            case 19:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString19 = parcel.readString();
                    if (readString19 != null) {
                        return SearchFeatureLocation.valueOf(readString19);
                    }
                    return null;
                } catch (Throwable unused19) {
                    return null;
                }
            case 20:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString20 = parcel.readString();
                    if (readString20 != null) {
                        return GoldStandardStepsLocation.valueOf(readString20);
                    }
                    return null;
                } catch (Throwable unused20) {
                    return null;
                }
            case 21:
                return new SearchTypeaheadItemFeed(parcel, 0);
            case 22:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString21 = parcel.readString();
                    if (readString21 != null) {
                        return SettingsProfileFeatureLocation.valueOf(readString21);
                    }
                    return null;
                } catch (Throwable unused21) {
                    return null;
                }
            case 23:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString22 = parcel.readString();
                    if (readString22 != null) {
                        return SettingsSecurityFeatureLocation.valueOf(readString22);
                    }
                    return null;
                } catch (Throwable unused22) {
                    return null;
                }
            case 24:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString23 = parcel.readString();
                    if (readString23 != null) {
                        return SettingsUnlinkBAFeatureLocation.valueOf(readString23);
                    }
                    return null;
                } catch (Throwable unused23) {
                    return null;
                }
            case 25:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString24 = parcel.readString();
                    if (readString24 != null) {
                        return SettingsMenuFeatureLocation.valueOf(readString24);
                    }
                    return null;
                } catch (Throwable unused24) {
                    return null;
                }
            case 26:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString25 = parcel.readString();
                    if (readString25 != null) {
                        return SettingsNotificationsFeatureLocation.valueOf(readString25);
                    }
                    return null;
                } catch (Throwable unused25) {
                    return null;
                }
            case 27:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString26 = parcel.readString();
                    if (readString26 != null) {
                        return SettingsPermissionsFeatureLocation.valueOf(readString26);
                    }
                    return null;
                } catch (Throwable unused26) {
                    return null;
                }
            case 28:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString27 = parcel.readString();
                    if (readString27 != null) {
                        return SettingsPrivacyDataFeatureLocation.valueOf(readString27);
                    }
                    return null;
                } catch (Throwable unused27) {
                    return null;
                }
            default:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString28 = parcel.readString();
                    if (readString28 != null) {
                        return ShoppingFeatureLocation.valueOf(readString28);
                    }
                    return null;
                } catch (Throwable unused28) {
                    return null;
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f45305a) {
            case 0:
                return new BoardPermissionsFeatureLocation[i13];
            case 1:
                return new BoardSectionFeatureLocation[i13];
            case 2:
                return new BubbleFeatureLocation[i13];
            case 3:
                return new QcmCloseupDrawerLocation[i13];
            case 4:
                return new ConversationFeatureLocation[i13];
            case 5:
                return new CreatorFeatureLocation[i13];
            case 6:
                return new CreatorHubSavedBoardsLocation[i13];
            case 7:
                return new DidItFeatureLocation[i13];
            case 8:
                return new EngagementFeatureLocation[i13];
            case 9:
                return new HomeFeedTunerLocation[i13];
            case 10:
                return new IdeaPinCreationLocation[i13];
            case 11:
                return new LocationRequestLocation[i13];
            case 12:
                return new MediaGalleryLocation[i13];
            case 13:
                return new NewsHubItemFeed[i13];
            case 14:
                return new PearLocation[i13];
            case 15:
                return new PinFeatureModuleLocation[i13];
            case 16:
                return new RepinFeatureLocation[i13];
            case 17:
                return new PinOrSpinFeatureLocation[i13];
            case 18:
                return new ScheduledPinsLocation[i13];
            case 19:
                return new SearchFeatureLocation[i13];
            case 20:
                return new GoldStandardStepsLocation[i13];
            case 21:
                return new SearchTypeaheadItemFeed[i13];
            case 22:
                return new SettingsProfileFeatureLocation[i13];
            case 23:
                return new SettingsSecurityFeatureLocation[i13];
            case 24:
                return new SettingsUnlinkBAFeatureLocation[i13];
            case 25:
                return new SettingsMenuFeatureLocation[i13];
            case 26:
                return new SettingsNotificationsFeatureLocation[i13];
            case 27:
                return new SettingsPermissionsFeatureLocation[i13];
            case 28:
                return new SettingsPrivacyDataFeatureLocation[i13];
            default:
                return new ShoppingFeatureLocation[i13];
        }
    }
}
