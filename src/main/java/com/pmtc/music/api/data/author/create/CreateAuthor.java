package com.pmtc.music.api.data.author.create;

import com.pmtc.music.api.domain.author.models.AuthorModel;
import com.pmtc.music.api.domain.author.protocols.http.dto.add.AddAuthorDTO;
import com.pmtc.music.api.domain.author.useCases.create.CreateNewAuthor;
import com.pmtc.music.api.infra.database.repository.create.AddAuthorRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateAuthor implements CreateNewAuthor {
    private final AddAuthorRepository addAuthorRepository;

    @Override
    public AuthorModel onCreateAuthor(AddAuthorDTO addAuthorDTO) {
        return new AuthorModel("any name");
    }
}
