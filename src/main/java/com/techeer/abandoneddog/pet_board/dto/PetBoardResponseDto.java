package com.techeer.abandoneddog.pet_board.dto;

import com.techeer.abandoneddog.animal.PetInfoDto.PetInfoDto;
import com.techeer.abandoneddog.pet_board.entity.PetBoard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Getter
@AllArgsConstructor

@NoArgsConstructor
public class PetBoardResponseDto {
    private Long petBoardId;
    private String title;
    private String description;
    @Nullable
    private PetInfoDto petInfo;
    @Nullable
    private String status;
    private Integer likeCount;

    public static PetBoardResponseDto fromEntity(PetBoard petBoard) {
        PetInfoDto petInfoDto = null;
        if (petBoard.getPetInfo() != null) {
            petInfoDto = new PetInfoDto(
                    petBoard.getPetInfo().getId(),
                    petBoard.getPetInfo().getDesertionNo(),
                    petBoard.getPetInfo().getFilename(),
                    petBoard.getPetInfo().getPopfile(),
                    petBoard.getPetInfo().getProcessState(),
                    petBoard.getPetInfo().getAge(),
                    petBoard.getPetInfo().getWeight(),
                    petBoard.getPetInfo().getSexCd(),
                    petBoard.getPetInfo().getKindCd(),
                    petBoard.getPetInfo().getPetType(),
                    petBoard.getPetInfo().isPublicApi()
            );
        }

        return new PetBoardResponseDto(
                petBoard.getPetBoardId(),
                petBoard.getTitle(),
                petBoard.getDescription(),
                petInfoDto,
                petBoard.getStatus() != null ? petBoard.getStatus().toString() : "N/A",
                petBoard.getLikeCount()
        );
    }
}